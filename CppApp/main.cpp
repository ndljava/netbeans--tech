/* 
 * File:   main.cpp
 * Author: Administrator
 *
 * Created on May 22, 2013, 6:00 PM
 */

#include <cstdlib>
#include <iostream>
#include <winsock.h>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    std::cout << "ndljava" << endl;

    string b = "fgthdrthdrtdrt";

    std::cout << b;

    int i = 3;
    switch (i) {
        case 1:
            std::cout << i << endl;
            break;
        case 2:
            std::cout << i << endl;
            break;
        case 3:
            std::cout << i << endl;
            break;
    }

    CHAR t = 'r';
    int k=-126;
    unsigned char p=-126;
    
    cout<<k<<p<<char(k)<<endl;
    
    std:: cout << t<<"==="<<sizeof(t) << endl;
 
    return 0;
}

