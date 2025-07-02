#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;
    int a[n];
    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) cin >> a[i];

    for(int i = 1; i < n; i++) {
        int key = a[i], j = i - 1;
        while(j >= 0 && a[j] > key) a[j + 1] = a[j--];
        a[j + 1] = key;
    }

    cout << "Sorted array using Insertion Sort:\n";
    for(int i = 0; i < n; i++) cout << a[i] << " ";
    cout << endl;
    return 0;
}

/*
Sample Input:
Enter number of elements: 5
Enter elements:
5 3 1 4 2

Sample Output:
Sorted array using Insertion Sort:
1 2 3 4 5
*/
