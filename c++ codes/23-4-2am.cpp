#include <iostream>
using namespace std;
class BankAccount
{
private:
    string accountHolderName;
    int balance = 0;

public:
    string name;
    int initialBalance;

    string getaccountHoldername()
    {
        return accountHolderName;
    }
    int getBalance()
    {
        return balance;
    }
    void Deposit(int money)
    {
        if (money > 0 && balance == 0)
        {
            balance = initialBalance + money;
            cout << "Deposit sucessful" << endl;
        }
        else if (money > 0)
        {
            balance = money + balance;
            cout << "Deposit sucessful" << endl;
        }
    }
    void Withdraw(int money)
    {
        if (money > 0 && money <= balance)
        {
            balance = balance - money;
            cout << "Withdrawl successful" << endl;
        }
        else
            cout << "Withdrawl unsucessful." << endl;
    }

    BankAccount(string accountHolderName, int initialBalance)
    {
        this->accountHolderName = accountHolderName;
        this->initialBalance = initialBalance;
    }
};
int main()
{
    BankAccount acc("Ritish", 1000);
    acc.Deposit(500);
    cout << "Account Holder Balance:" << acc.getBalance() << endl;
    // deposited 500 and checked balance after deposit
    acc.Withdraw(200);
    cout << "Account Holder Balance:" << acc.getBalance() << endl;
    // withdrew 200 and checked balance after withdrawl
    acc.Withdraw(2000);
    cout << "Account Holder Balance:" << acc.getBalance() << endl;
    // tried to withdraw 2000 but it should not be allowed as balance is less than 2000
}