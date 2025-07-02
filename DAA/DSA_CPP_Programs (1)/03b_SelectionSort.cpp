#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;
    int a[n];
    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) cin >> a[i];

    for(int i = 0; i < n - 1; i++) {
        int min = i;
        for(int j = i + 1; j < n; j++)
            if(a[j] < a[min]) min = j;
        swap(a[i], a[min]);
    }

    cout << "Sorted array using Selection Sort:\n";
    for(int i = 0; i < n; i++) cout << a[i] << " ";
    cout << endl;
    return 0;
}

/*
Sample Input:
Enter number of elements: 5
Enter elements:
64 25 12 22 11

Sample Output:
Sorted array using Selection Sort:
11 12 22 25 64
*/
