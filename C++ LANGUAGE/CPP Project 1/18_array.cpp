#include <iostream>

using namespace std;

int totalChaiServed(int chai[], int size){
 int total = 0;
 for (int i=0; i<size; i++){
    total += chai[i];
 }
    return total;
}

int main() {
    int chaiServed[7] = {23, 45, 67, 54, 43, 68, 65};

    int total = totalChaiServed(chaiServed, 7);


    return 0;
}


