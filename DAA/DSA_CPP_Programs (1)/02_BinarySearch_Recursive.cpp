#include<iostream>
using namespace std;

int binarySearch(int a[], int l, int r, int x) {
    if(l > r) return -1;
    int m = (l + r) / 2;
    if(a[m] == x) return m;
    if(x < a[m]) return binarySearch(a, l, m - 1, x);
    return binarySearch(a, m + 1, r, x);
}

int main() {
    int n, x;
    cout << "Enter size of array: ";
    cin >> n;
    int a[n];
    cout << "Enter sorted elements:\n";
    for(int i = 0; i < n; i++) cin >> a[i];
    cout << "Enter element to search: ";
    cin >> x;
    int idx = binarySearch(a, 0, n - 1, x);
    if(idx == -1)
        cout << "Element not found.\n";
    else
        cout << "Element found at index " << idx << ".\n";
    return 0;
}

/*
Sample Input:
Enter size of array: 5
Enter sorted elements:
1 3 5 7 9
Enter element to search: 7

Sample Output:
Element found at index 3.
*/
