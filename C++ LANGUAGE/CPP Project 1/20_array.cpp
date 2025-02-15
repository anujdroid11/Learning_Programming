#include <iostream>

using namespace std;

int main()
{
    int chaiSales[3][7] =
    {
        {
            50, 60, 70, 80, 90, 100, 45
        }, // Shop 1 sales for 7 days
        {
            50, 60, 70, 80, 90, 100, 45
        }, // Shop 2 sales for 7 days
        {
            50, 60, 70, 80, 90, 100, 45
        } // Shop 3 sales for 7 days

    };

    for (int i=0; i<3; i++) {
        cout << "I am at shop: " << i+1 << "\n" ;
        for (int j=0; j<7; j++) {
            cout << chaiSales[i][j] << " cups \n";
        }
    }


    return 0;
}


