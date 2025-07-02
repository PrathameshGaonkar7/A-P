#include<iostream>
#include<algorithm>
using namespace std;

struct Item {
    int value, weight;
};

bool cmp(Item a, Item b) {
    double r1 = (double)a.value / a.weight;
    double r2 = (double)b.value / b.weight;
    return r1 > r2;
}

int main() {
    int n, W;
    cout << "Enter number of items: ";
    cin >> n;
    Item items[n];
    cout << "Enter value and weight of each item:\n";
    for(int i = 0; i < n; i++)
        cin >> items[i].value >> items[i].weight;

    cout << "Enter capacity of knapsack: ";
    cin >> W;

    sort(items, items + n, cmp);
    double total = 0.0;

    for(int i = 0; i < n; i++) {
        if(W == 0) break;
        if(items[i].weight <= W) {
            total += items[i].value;
            W -= items[i].weight;
        } else {
            total += items[i].value * ((double)W / items[i].weight);
            break;
        }
    }

    cout << "Maximum value in knapsack = " << total << endl;
    return 0;
}

/*
Sample Input:
3
60 10
100 20
120 30
50

Sample Output:
Maximum value in knapsack = 240
*/
