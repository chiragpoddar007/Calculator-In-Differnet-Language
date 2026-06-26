#include<iostream>
using namespace std;

int main(){
    double number_1, number_2;
    char operation;

    cout<<"Enter First Number: ";
    cin>>number_1;

    cout<<"\nEnter Second Number: ";
    cin>>number_2;

    cout<<"\nEnter Operation (+, -, *, /): ";
    cin>>operation;

    if(operation == '+'){
        cout<<"\nResult: "<<number_1 + number_2;
    }
    else if(operation == '-'){
        cout<<"\nResult: "<<number_1 - number_2;
    }
    else if(operation == '*'){
        cout<<"\nResult: "<<number_1 * number_2;
    }
    else if(operation == '/'){
        if(number_2 != 0){
            cout<<"\nResult: "<<number_1 / number_2;
        }
        else{
            cout<<"\nError: Division by zero is not allowed.";
        }
    }
    else{
        cout<<"\nError: Invalid operation.";
    }
}