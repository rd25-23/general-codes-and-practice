import requests
from bs4 import BeautifulSoup


def decode_secret_message(doc_url):
    # this function is used for getting webpage content from the given url
    webpage = requests.get(doc_url)
    webpage.raise_for_status()

    soup = BeautifulSoup(webpage.text, "html.parser")
    table = soup.find("table")

    data_rows = table.find_all("tr")[1:]

    entries = []
    width = 0
    height = 0

    for row in data_rows:
        cells = row.find_all("td")
        x = int(cells[0].get_text(strip=True))
        char = cells[1].get_text(strip=True)
        y = int(cells[2].get_text(strip=True))

        entries.append((x, y, char))
        width = max(width, x)
        height = max(height, y)

    grid = [[" " for _ in range(width + 1)] for _ in range(height + 1)]

    for x, y, char in entries:
        grid[y][x] = char

    for line in grid:
        print("".join(line))


url = input("Enter the URL of the published Google Doc: ")
decode_secret_message(url)
