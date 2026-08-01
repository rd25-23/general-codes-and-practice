import requests
from bs4 import BeautifulSoup


def decode_secret_message(doc_url):
    # downloades the webpage content from the url
    webpage = requests.get(doc_url)
    webpage.raise_for_status()

    html_doc = BeautifulSoup(webpage.text, "html.parser")
    # finds the table containing the coordinates and characters from the html document
    table = html_doc.find("table")
    data_rows = table.find_all("tr")[1:]

    coordinates = []
    max_x = 0
    max_y = 0

    for row in data_rows:
        columns = row.find_all("td")
        x = int(columns[0].get_text(strip=True))

        char = columns[1].get_text(strip=True)
        if char == "":
            char = " "

        y = int(columns[2].get_text(strip=True))

        coordinates.append((x, y, char))

        max_x = max(max_x, x)
        max_y = max(max_y, y)

    # empty grid with max coordinates
    grid = [[" " for _ in range(max_x + 1)] for _ in range(max_y + 1)]

    for x, y, char in coordinates:
        grid[y][x] = char

    # final decoded secret message
    for row in reversed(grid):
        print("".join(row))


url = input("Enter the URL of the published Google Doc: ")
decode_secret_message(url)
