#include <iostream>
#include <vector>
#include <deque>
#include <list>
#include <set>
#include <map>
#include <string>
#include <ctime>
#include <unordered_set>
#include <unordered_map>

using namespace std;

struct Product
{
    int productID;
    string name;
    string category;

};

struct Order
{
    int orderID;
    int ProductID;
    int quantity;
    string customerID;
    time_t orderDate;
};


int main()
{
    vector<Product> Products =
    {
        {
            101, "Laptop", "Electronics"
        },
        {
            102, "Phone", "Electronics"
        },
        {
            103, "Coffee Maker", "Kitchen"
        },
        {
            104, "Blender", "Kitchen"
        },
        {
            105, "Desk Lamp", "Home"
        },
    };

    deque<string> recentCustomers = {"C001", "C002", "C003"};

    recentCustomers.push_back("C004");
    recentCustomers.push_front("C005");

    list<Order> orderHistory;

    orderHistory.push_back({1, 101, 1, "C001", time(0)});
    orderHistory.push_back({2, 102, 2, "C002", time(0)});
    orderHistory.push_back({3, 103, 1, "C003", time(0)});

    set<string> categories;

    for (const auto &Product: products)
    {
        categories.insert(Product.category);
    }

    map<int, int> productStock =
    {
        {
            101, 10
        },
        {
            102, 20
        },
        {
            103, 15
        },
        {
            104, 15
        },
        {
            105, 17
        },
    };

    multimap<string, Order> customerOrders;
    for (const auto &order: orderHistory)
    {
        customerOrders.insert({order.customerID, order});
    }

    unordered_map<string, string> customerData =
    {
        {
            "C001", "Alice"
        },
        {
            "C002", "Anuj"
        },
        {
            "C003", "Arpit"
        },
        {
            "C004", "max"
        },
        {
            "C005", "harry"
        },
    };

    unordered_set<int> uniqueProductsIDs;

    for (const auto &Product: Products){
        uniqueProductsIDs.insert(Product.productID);
    }


    return 0;
}

