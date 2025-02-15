#include <iostream>
using namespace std;
int main() {
    int cups;
    bool isStudent;
    cout << "Are you a Student (1 for yes and 0 for No) ?";
    cin >> isStudent;
    cout << "How many cups of tea have You Buy ?";
    cin >> cups;

    if (isStudent || cups > 15) {
        cout << "Your are eligible for a discount " << endl;
    } else {
        cout << "You are not eligible for a discount " << endl;
    }

    return 0;
}


