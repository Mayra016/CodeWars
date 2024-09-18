#include <vector>
#include <algorithm> 
using namespace std;

// 2317 ms
int min(vector<int> list){
    return *std::min_element(list.begin(), list.end());
}

int max(vector<int> list){
    return *std::max_element(list.begin(), list.end());
}

// 2717 ms
int min2(vector<int> list){
    std::sort(list.begin(), list.end());
    return list[0];
}

int max2(vector<int> list){
    std::sort(list.begin(), list.end());
    return list.back();
}
