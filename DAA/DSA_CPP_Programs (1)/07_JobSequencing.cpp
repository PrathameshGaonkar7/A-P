#include<iostream>
#include<algorithm>
using namespace std;

struct Job {
    char id;
    int deadline, profit;
};

bool cmp(Job a, Job b) {
    return a.profit > b.profit;
}

int main() {
    int n;
    cout << "Enter number of jobs: ";
    cin >> n;
    Job jobs[n];
    cout << "Enter job id, deadline and profit:\n";
    for(int i = 0; i < n; i++)
        cin >> jobs[i].id >> jobs[i].deadline >> jobs[i].profit;

    sort(jobs, jobs + n, cmp);
    bool slot[n] = {false};
    char result[n];

    for(int i = 0; i < n; i++) {
        for(int j = min(n, jobs[i].deadline) - 1; j >= 0; j--) {
            if(!slot[j]) {
                slot[j] = true;
                result[j] = jobs[i].id;
                break;
            }
        }
    }

    cout << "Selected job sequence for max profit: ";
    for(int i = 0; i < n; i++)
        if(slot[i]) cout << result[i] << " ";
    cout << endl;
    return 0;
}

/*
Sample Input:
5
a 2 100
b 1 19
c 2 27
d 1 25
e 3 15

Sample Output:
Selected job sequence for max profit: a c e
*/
