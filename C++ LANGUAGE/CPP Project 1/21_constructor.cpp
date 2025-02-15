#include <iostream>
#include <vector>

using namespace std;

class Chai
{
public:
    string teaName;
    int servings;
    vector<string> ingridients;

    //default constructor
    Chai()
    {
        teaName = "Unknown Tea";
        servings = 1;
        ingridients = {"Water", "Tea leaves"};
        cout << "Constructor Called" << endl;
    }


    void displayChaiDetails()
    {
        cout << "Tea Name: " << teaName << endl;
        cout << "Servings: " << servings << endl;
        cout << "Ingredients: " ;
        for (string ingridient : ingridients)
        {
            cout << ingridient << " " ;
        }
        cout << endl;

    }

};

int main ()
{
    Chai defaultChai;
    defaultChai.displayChaiDetails();

    return 0;
}
