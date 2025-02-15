#include <iostream>
#include <vector>

using namespace std;

class Chai {
public:
  //data members (attributes)
  string teaName; // name of the tea
  int servings; // number of servings
  vector <string> ingredients;  // list of ingredients for the tea

  // member function

  void displayChaiDetails(){
    cout << "Tea Name: " << teaName << endl;
    cout << "Servings: " << servings << endl;
    cout << "Ingredients: " ;
    for (string ingredient : ingredients) {
        cout << ingredient << " " ;
    }
    cout << endl;
  }

};

int main() {

    Chai chaiOne;
    chaiOne.teaName = "lemon tea";
    chaiOne.servings = 2;
    chaiOne.ingredients = {"Water","lemon","Honey","tea"};
    chaiOne.displayChaiDetails();

    Chai chaiTwo;

    chaiTwo.teaName = "Masala Chai";
    chaiTwo.servings = 3;
    chaiTwo.ingredients = {"Water","Milk","Tea","Ginger"};
    chaiTwo.displayChaiDetails();

    return 0;
}
