#include <iostream>
#include <string>

using namespace std;

int checkTemperature(int temperature)
{
    return temperature;
}

//declaration of function
void serveChai(int cups);

void makeChai()
{
    cout << "Boiling water, adding tea leaves, straining...";
}

void serveChai(string teaType = "Masala Tea")
{
    cout << "Serving" << teaType <<endl;
}


int main ()
{

    int temp = checkTemperature(29);
    cout << temp;
    makeChai(); // calling a funtion
    serveChai(3);
    serveChai("Lemon Tea");

    return 0;
}

//definition of function
void serveChai(int cups)
{
    cout << "\n Serving " << cups << " of Chai" ;
}
