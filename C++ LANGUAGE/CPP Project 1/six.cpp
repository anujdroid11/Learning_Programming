#include <iostream>
#include <string>

using namespace std;

int main(){

   string userTea;
   int teaQuantity;

   cout << "Whats Your Order \n";
   getline(cin,userTea);

   //ask for Quantity
   cout << "How many cups of " << userTea << "Would you like to have ? \n";
   cin >> teaQuantity;

   cout << teaQuantity;
   cout << userTea;

   return 0;
}

