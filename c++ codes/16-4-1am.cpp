#include <iostream>
using namespace std;
int add(int a, int b)
{
    return a + b;
}
float add(float a, float b)
{
    return a + b;
}
int main()
{
    int x, y;
    cout << "enter two numbers:";
    cin >> x >> y;

    cout << add(x, y);

    float a, b;
    cout << "\nEnter 2 numbers:";
    cin >> a >> b;

    cout << add(a, b);
}