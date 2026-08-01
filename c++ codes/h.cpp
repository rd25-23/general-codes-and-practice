/*
 * ============================================================
 * SMART STUDY PLANNER WITH FOCUS MODE
 * AND ADAPTIVE STRESS RESPONSE SYSTEM
 * ============================================================
 * OOP Concepts Demonstrated:
 * - Encapsulation    (private data + getters)
 * - Inheritance       (ExamTask, AssignmentTask extend Task)
 * - Polymorphism      (virtual display() override)
 * - Abstraction       (public interfaces hide internals)
 * - Composition       (Planner uses StressManager, Game)
 * - Smart Pointers    (unique_ptr for memory safety)
 * ============================================================
 */

#include <iostream>
#include <vector>
#include <string>
#include <memory>
#include <iomanip>

using namespace std;

// =====================================================
// BASE CLASS: Task
// =====================================================
class Task
{
private:
    string title;
    int daysLeft;
    int priority;

public:
    Task(string t, int d, int p) : title(t), daysLeft(d), priority(p) {}

    string getTitle() const { return title; }
    int getDaysLeft() const { return daysLeft; }
    int getPriority() const { return priority; }

    virtual void display() const
    {
        cout << "  Title    : " << title << "\n";
        cout << "  Days Left: " << daysLeft << "\n";
        cout << "  Priority : " << priority << "/10\n";
    }

    virtual string getType() const { return "Generic Task"; }
    virtual ~Task() {}
};

// =====================================================
// DERIVED CLASS: ExamTask
// =====================================================
class ExamTask : public Task
{
private:
    string subject;

public:
    ExamTask(string t, int d, int p, string s)
        : Task(t, d, p), subject(s) {}

    string getSubject() const { return subject; }

    void display() const override
    {
        cout << "  [EXAM TASK]\n";
        Task::display();
        cout << "  Subject  : " << subject << "\n";
    }

    string getType() const override { return "Exam"; }
};

// =====================================================
// DERIVED CLASS: AssignmentTask
// =====================================================
class AssignmentTask : public Task
{
private:
    string topic;

public:
    AssignmentTask(string t, int d, int p, string tp)
        : Task(t, d, p), topic(tp) {}

    string getTopic() const { return topic; }

    void display() const override
    {
        cout << "  [ASSIGNMENT TASK]\n";
        Task::display();
        cout << "  Topic    : " << topic << "\n";
    }

    string getType() const override { return "Assignment"; }
};

// =====================================================
// CLASS: StressManager
// =====================================================
class StressManager
{
private:
    int calculateStressScore(const vector<unique_ptr<Task>> &tasks) const
    {
        if (tasks.empty())
            return 0;
        int totalTasks = static_cast<int>(tasks.size());
        int minDays = 999;
        for (const auto &t : tasks)
        {
            if (t->getDaysLeft() < minDays)
                minDays = t->getDaysLeft();
        }
        if (minDays < 0)
            minDays = 0;

        int highPriorityCount = 0;
        for (const auto &t : tasks)
        {
            if (t->getPriority() >= 8)
                highPriorityCount++;
        }
        return (totalTasks * 100) / (minDays + 1) + (highPriorityCount * 5);
    }

public:
    string getStressLevel(const vector<unique_ptr<Task>> &tasks) const
    {
        int score = calculateStressScore(tasks);
        if (score <= 30)
            return "LOW";
        if (score <= 70)
            return "MEDIUM";
        return "HIGH";
    }

    int getStressScore(const vector<unique_ptr<Task>> &tasks) const
    {
        return calculateStressScore(tasks);
    }

    bool isBurnoutCondition(const vector<unique_ptr<Task>> &tasks) const
    {
        if (tasks.empty())
            return false;
        int totalTasks = static_cast<int>(tasks.size());
        int minDays = 999;
        for (const auto &t : tasks)
        {
            if (t->getDaysLeft() < minDays)
                minDays = t->getDaysLeft();
        }
        return (totalTasks > minDays) && (getStressLevel(tasks) == "HIGH");
    }
};

// =====================================================
// CLASS: Game (Tic Tac Toe)
// =====================================================
class Game
{
private:
    char board[3][3];
    char currentPlayer;

    void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '1' + i * 3 + j;
    }

    void drawBoard() const
    {
        cout << "\n        Tic Tac Toe\n";
        cout << "  ==========================\n";
        for (int i = 0; i < 3; i++)
        {
            cout << "        ";
            for (int j = 0; j < 3; j++)
            {
                cout << " " << board[i][j] << " ";
                if (j < 2)
                    cout << "|";
            }
            cout << "\n";
            if (i < 2)
                cout << "       ---|---|---\n";
        }
        cout << "  ==========================\n";
    }

    bool checkWin() const
    {
        for (int i = 0; i < 3; i++)
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
        for (int j = 0; j < 3; j++)
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j])
                return true;
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;
        return false;
    }

    bool checkDraw() const
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] != 'X' && board[i][j] != 'O')
                    return false;
        return true;
    }

    bool makeMove(int pos)
    {
        int row = (pos - 1) / 3;
        int col = (pos - 1) % 3;
        if (pos < 1 || pos > 9)
            return false;
        if (board[row][col] == 'X' || board[row][col] == 'O')
            return false;
        board[row][col] = currentPlayer;
        return true;
    }

public:
    Game() : currentPlayer('X') { initializeBoard(); }

    void play()
    {
        cout << "\n  ===========================================\n";
        cout << "  ADAPTIVE STRESS RESPONSE SYSTEM ACTIVATED!\n";
        cout << "  ===========================================\n";
        cout << "  Your brain sent an SOS signal.\n";
        cout << "  Studies show that a quick game of\n";
        cout << "  Tic Tac Toe reduces stress by 300%*\n";
        cout << "  (*Source: Trust me bro)\n";
        cout << "  ===========================================\n";

        int move;
        bool gameOver = false;

        while (!gameOver)
        {
            drawBoard();
            cout << "  Player " << currentPlayer << ", enter position (1-9): ";
            cin >> move;

            if (cin.fail())
            {
                cin.clear();
                cin.ignore(10000, '\n');
                cout << "  Invalid input! Enter a number 1-9.\n";
                continue;
            }

            if (!makeMove(move))
            {
                cout << "  Invalid move! Try again.\n";
                continue;
            }

            if (checkWin())
            {
                drawBoard();
                cout << "\n  *** Player " << currentPlayer << " WINS! ***\n";
                gameOver = true;
            }
            else if (checkDraw())
            {
                drawBoard();
                cout << "\n  *** It's a DRAW! ***\n";
                gameOver = true;
            }
            else
            {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        cout << "\n  Feel better? Now back to reality.\n";
        cout << "  (Spoiler: The tasks are still there)\n\n";
    }
};

// =====================================================
// CLASS: Planner
// =====================================================
class Planner
{
private:
    vector<unique_ptr<Task>> tasks;
    StressManager stressManager;

public:
    void addExamTask(string title, int daysLeft, int priority, string subject)
    {
        tasks.push_back(make_unique<ExamTask>(title, daysLeft, priority, subject));
    }

    void addAssignmentTask(string title, int daysLeft, int priority, string topic)
    {
        tasks.push_back(make_unique<AssignmentTask>(title, daysLeft, priority, topic));
    }

    void displayAllTasks() const
    {
        if (tasks.empty())
        {
            cout << "\n  No tasks found. Enjoy your freedom!\n\n";
            return;
        }
        cout << "\n  ========================================\n";
        cout << "          ALL TASKS (" << tasks.size() << ")\n";
        cout << "  ========================================\n";
        for (size_t i = 0; i < tasks.size(); i++)
        {
            cout << "\n  Task #" << i + 1 << ":\n";
            tasks[i]->display();
            cout << "  ----------------------------------------\n";
        }
    }

    void focusMode() const
    {
        cout << "\n  ========================================\n";
        cout << "          FOCUS MODE ACTIVATED\n";
        cout << "  (Priority >= 8 OR Deadline <= 2 days)\n";
        cout << "  ========================================\n";
        bool found = false;
        for (size_t i = 0; i < tasks.size(); i++)
        {
            if (tasks[i]->getPriority() >= 8 || tasks[i]->getDaysLeft() <= 2)
            {
                cout << "\n  Task #" << i + 1 << ":\n";
                tasks[i]->display();
                cout << "  ----------------------------------------\n";
                found = true;
            }
        }
        if (!found)
        {
            cout << "\n  No urgent tasks. You're doing great!\n";
        }
    }

    void checkStress()
    {
        if (tasks.empty())
        {
            cout << "\n  No tasks = No stress. Living the dream!\n\n";
            return;
        }
        int score = stressManager.getStressScore(tasks);
        string level = stressManager.getStressLevel(tasks);
        int minDays = 999;
        for (const auto &t : tasks)
        {
            if (t->getDaysLeft() < minDays)
                minDays = t->getDaysLeft();
        }

        cout << "\n  ========================================\n";
        cout << "          STRESS ANALYZER\n";
        cout << "  ========================================\n";
        cout << "  Tasks Count      : " << tasks.size() << "\n";
        cout << "  Nearest Deadline : " << minDays << " days\n";
        cout << "  Stress Score     : " << score << "\n";
        cout << "  Stress Level     : " << level << "\n\n";

        if (stressManager.isBurnoutCondition(tasks))
        {
            Game game;
            game.play();
        }
        else if (level == "HIGH")
        {
            cout << "  Stress is high. Take a short break!\n\n";
        }
        else if (level == "MEDIUM")
        {
            cout << "  Moderate stress. Plan wisely!\n\n";
        }
        else
        {
            cout << "  Stress is low. Keep it up!\n\n";
        }
    }
};

// =====================================================
// MAIN FUNCTION
// =====================================================
int main()
{
    Planner planner;
    int choice;

    while (true)
    {
        cout << "\n  ============================================\n";
        cout << "    SMART STUDY PLANNER WITH FOCUS MODE\n";
        cout << "    & ADAPTIVE STRESS RESPONSE SYSTEM\n";
        cout << "  ============================================\n";
        cout << "  1. Add Exam Task\n  2. Add Assignment Task\n";
        cout << "  3. Show All Tasks\n  4. Focus Mode\n";
        cout << "  5. Check Stress\n  6. Exit\n  Enter choice: ";

        if (!(cin >> choice))
        {
            cin.clear();
            cin.ignore(10000, '\n');
            continue;
        }

        if (choice == 1)
        {
            string t, s;
            int d, p;
            cin.ignore();
            cout << "  Title: ";
            getline(cin, t);
            cout << "  Subject: ";
            getline(cin, s);
            cout << "  Days Left: ";
            cin >> d;
            cout << "  Priority (1-10): ";
            cin >> p;
            planner.addExamTask(t, d, p, s);
        }
        else if (choice == 2)
        {
            string t, tp;
            int d, p;
            cin.ignore();
            cout << "  Title: ";
            getline(cin, t);
            cout << "  Topic: ";
            getline(cin, tp);
            cout << "  Days Left: ";
            cin >> d;
            cout << "  Priority (1-10): ";
            cin >> p;
            planner.addAssignmentTask(t, d, p, tp);
        }
        else if (choice == 3)
        {
            planner.displayAllTasks();
        }
        else if (choice == 4)
        {
            planner.focusMode();
        }
        else if (choice == 5)
        {
            planner.checkStress();
        }
        else if (choice == 6)
        {
            cout << "\n  Exiting Smart Study Planner. Good luck!\n\n";
            return 0;
        }
    }
    return 0;
}