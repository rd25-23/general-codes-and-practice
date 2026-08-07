int findMaxConsecutiveOnes(vector<int> &nums)
{
    // Type your code here

    int n = nums.size();
    int current = 0, max = 0;
    for (int i = 0; i < n; i++)
    {
        if (nums[i] == 1)
        {

            current = current + 1;
            if (current > max)
            {
                max = current;
            }
        }
        else
        {
            current = 0;
        }
    }
    return max;
}

void moveZeroes(vector<int> &nums)
{
    // Type your code here
    int n = nums.size();

    for (int i = 0; i < n; i++)
    {

        if (nums[i] == 0)
        {
            int l = i;
            for (l = i; l < n - 1; l++)
            {
                nums[l] = nums[l + 1];
            }
            nums[n - 1] = 0;
        }
    }
    for (int i = 0; i < n; i++)
    {

        if (nums[i] == 0)
        {
            int l = i;
            for (l = i; l < n - 1; l++)
            {
                nums[l] = nums[l + 1];
            }
            nums[n - 1] = 0;
        }
    }
}

int findSecondLargest(int arr[], int n)
{
    // Type your code here
    int max = arr[0];
    int secmax = arr[1];
    for (int i = 0; i < n; i++)
    {

        if (arr[i] > max)
        {

            secmax = max;

            max = arr[i];
        }
        else if (arr[i] > secmax)
        {
            secmax = arr[i];
        }
    }
}

void reverseArray(int arr[], int n)
{
    int start = 0;
    int end = n - 1; // The very last index

    while (start < end)
    {
        // The Three-Line Swap!
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Move the pointers inward
        start++;
        end--;
    }
}

bool isSorted(int arr[], int n)
{
    // Type your code here
    bool sorted = true;
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] < arr[i + 1])
        {
            sorted = true;
        }
        else
        {
            sorted = false;
            break;
        }
    }
    return sorted;
}

bool isPalindrome(int arr[], int n)
{
    // Type your code here
    bool palindrome = true;

    for (int i = 0; i < n / 2; i++)
    {
        if (arr[i] == arr[n - i - 1])
        {
            palindrome = true;
        }
        else
        {
            palindrome = false;
            return palindrome;
        }
    }
}

void leftShift(int arr[], int n)
{
    // Type your code here
    int temp = arr[0] for (int i = 0; i < n - 1; i++){
        arr[i] = arr[i + 1]

    } arr[n - 1] = temp;
}

void moveEvens(int arr[], int n)
{
    // Type your code here
    int inserposs = n - 1;
    int temp = 0;
    for (int i = 0; i < n; i++)
    {
        if
            [arr[inserposs] % 2 != 0]
            {
                inserposs--;
            }

            if (arr[i] % 2 != 0)
            {
                temp = arr[inserposs];
                arr[inserposs] = arr[i];
                arr[i] = temp;
            }
    }
}

void sortBinary(int arr[], int n)
{
    // Type your code here
    int left = 0;
    int right = n - 1;
    int temp = 0;
    while (left < right)
    {
        if (arr[left] == 0)
        {
            left++;
        }
        else if (arr[right] == 1)
        {
            right--;
        }
        else
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

int searchTarget(int arr[], int n, int target)
{
    // Type your code here
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == target)
        {
            return i;
        }
    }
}

bool hasTwoSum(int arr[], int n, int target)
{
    // Type your code here
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[i] + arr[j] == target && i != j)
            {
                return true;
            }
        }
    }
    return false;
}

void rightShift(int arr[], int n)
{
    // Type your code here
    temp = arr[n - 1];
    for (int i = 0; i < n - 1; i++)
    {
        arr[n - i - 1] = arr[n - i - 2]
    }
    arr[0] = temp;
}

bool areArraysEqual(int arr1[], int arr2[], int n)
{
    // Type your code here
    for (int i = 0; i < n; i++)
    {
        if (arr1[i] != arr2[i])
        {
            return false
        }
    }
    return true
}

int sumOfOdds(int arr[], int n)
{
    // Type your code here
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 != 0)
        {
            sum = sum + arr[i];
        }
    }
    return sum;
}

bool isAlternating(int arr[], int n)
{
    // Type your code here
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0)
        {
            return false;
        }
        else if (arr[i] % 3 == 0 && arr[i + 1] % 3 == 0)
        {
            return false;
        }
    }
    return true;
}

int findMaxConsecutiveOnes(int arr[], int n)
{
    // Type your code here
    int s = 0;
    int max = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 1)
        {
            s = s + 1;

            if (s > max)
            {
                max = s;
            }
        }
        else
        {
            s = 0;
        }
    }
    return max;
}

int findMissingNumber(int arr[], int n)
{
    // Type your code here
    for (int i = 0; i < n; i++)
    {
        if (arr[i] != i + 1)
        {
            return i + 1;
        }
    }
}

int findSecondLargest(int arr[], int n)
{
    // Type your code here
    int max = 0;
    int smax = 0;

    for (int i = 0; i < m; i++)
    {
        if (arr[i] > max)
        {
            smax = max;
            max = arr[i];
        }
        else if (arr[i] > smax)
        {
            smax = arr[i];
        }
    }
    return smax;
}

void runningTotal(int arr[], int n)
{
    // Type your code here

    for (int i = 1; i < n; i++)
    {
        arr[i] = arr[i] + arr[i - 1];
    }
}
