#include<iostream>
#include<algorithm>
using namespace std;

struct Edge {
    int u, v, w;
};

bool cmp(Edge a, Edge b) {
    return a.w < b.w;
}

int parent[100];

int find(int i) {
    if(parent[i] == i) return i;
    return parent[i] = find(parent[i]);
}

void unite(int u, int v) {
    parent[find(u)] = find(v);
}

int main() {
    int n, e;
    cout << "Enter number of vertices and edges: ";
    cin >> n >> e;
    Edge edges[e];
    cout << "Enter u v w of each edge:\n";
    for(int i = 0; i < e; i++)
        cin >> edges[i].u >> edges[i].v >> edges[i].w;

    sort(edges, edges + e, cmp);
    for(int i = 0; i < n; i++) parent[i] = i;

    cout << "Edges in MST:\n";
    for(int i = 0; i < e; i++) {
        int u = edges[i].u, v = edges[i].v;
        if(find(u) != find(v)) {
            cout << u << " - " << v << " : " << edges[i].w << endl;
            unite(u, v);
        }
    }
    return 0;
}
