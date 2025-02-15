#include <iostream>

using namespace std;

int main(){

   float teaPrice = 48.98;
   int roundedTeaPrice = (int) teaPrice;

   int teaQuantity = 2;
   double totalPrice = teaPrice * teaQuantity;

   cout << totalPrice << endl;

   return 0;
}

