#include <iostream>
#include <fstream>
using namespace std;
int main() {


    struct {             // Structure declaration
        int BlockID;         // Member (int variable)
        string BlockName;   // Member (string variable)
    } Block;       // Structure variable

    Block.BlockID=1;
    Block.BlockName="frist Block";

	fstream my_file;
	my_file.open("my_file.dbt", ios::out);
	if(!my_file) {
		cout << "File not created!";
	}
	else {
		cout << "File created successfully!";
        my_file << Block.BlockID << " " << Block.BlockName << "\n";
        my_file << "Writing this to a file.\n";
		my_file.close(); 
	}
	return 0;
}