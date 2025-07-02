#include<iostream>
#include<queue>
#include<vector>
using namespace std;

void DFS(int v, vector<vector<int>> &adj, vector<bool> &visited) {
    visited[v] = true;
    cout << v << " ";
    for(int u : adj[v])
        if(!visited[u]) DFS(u, adj, visited);
}

void BFS(int start, vector<vector<int>> &adj, vector<bool> &visited) {
    queue<int> q;
    q.push(start);
    visited[start] = true;
    while(!q.empty()) {
        int v = q.front(); q.pop();
        cout << v << " ";
        for(int u : adj[v])
            if(!visited[u]) {
                visited[u] = true;
                q.push(u);
            }
    }
}

int main() {
    int n, e;
    cout << "Enter number of vertices and edges: ";
    cin >> n >> e;
    vector<vector<int>> adj(n);
    cout << "Enter edges (u v):\n";
    for(int i = 0; i < e; i++) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    vector<bool> visited(n, false);
    cout << "DFS starting from 0: ";
    DFS(0, adj, visited);

    fill(visited.begin(), visited.end(), false);
    cout << "\nBFS starting from 0: ";
    BFS(0, adj, visited);
    return 0;
}
