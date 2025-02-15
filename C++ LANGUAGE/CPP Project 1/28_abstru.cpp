#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Tea {
  public:
      virtual void prepareIngredients() = 0; //pure virtual function
      virtual void brew() = 0; //pure virtual function
      virtual void serve() = 0; //pure virtual function

      void makeTea(){
       prepareIngredients();
       brew();
       serve();
      }
};

//derivd class

class GreenTea : public Tea{
  public:
      void prepareIngredients() override {
       cout << "green leaves and water is ready" << endl;
      }

      void brew() override {
       cout << "Tea Brewed " << endl;
      }

       void serve() override {
       cout << "Tea served " << endl;
      }
};

class MasalaTea : public Tea{
  public:
      void prepareIngredients() override {
       cout << "green leaves and water is ready" << endl;
      }

      void brew() override {
       cout << "Tea Brewed " << endl;
      }

       void serve() override {
       cout << "masala Tea served " << endl;
      }
};

int main(){
  GreenTea greenTea;
  MasalaTea MasalaTea;

  greenTea.makeTea();
  MasalaTea.makeTea();
}
