#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;
    int a[n];
    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) cin >> a[i];

    for(int i = 0; i < n - 1; i++)
        for(int j = 0; j < n - i - 1; j++)
            if(a[j] > a[j + 1]) swap(a[j], a[j + 1]);

    cout << "Sorted array using Bubble Sort:\n";
    for(int i = 0; i < n; i++) cout << a[i] << " ";
    cout << endl;
    return 0;
}

/*
Sample Input:
Enter number of elements: 4
Enter elements:
4 3 2 1

Sample Output:
Sorted array using Bubble Sort:
1 2 3 4
*/
