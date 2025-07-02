#include<iostream>
using namespace std;

int main() {
    int n, x;
    cout << "Enter number of elements: ";
    cin >> n;
    int a[n];
    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) cin >> a[i];

    cout << "Enter element to search: ";
    cin >> x;

    for(int i = 0; i < n; i++) {
        if(a[i] == x) {
            cout << "Element found at index " << i << ".\n";
            return 0;
        }
    }
    cout << "Element not found.\n";
    return 0;
}

/*
Sample Input:
Enter number of elements: 5
Enter elements:
10 20 30 40 50
Enter element to search: 30

Sample Output:
Element found at index 2.
*/
