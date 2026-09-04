/*
 * Q3.cpp
 *
 *  Created on: 02-Sept-2026
 *      Author: Ritesh
 */


#include <iostream>
using namespace std;

class Entity{

private:
	string name;
	int health;
	int level;
	string type;

public:
	    Entity& setName(const string& name){
			this->name = name;
			return *this;
		}
		Entity& setHealth(int health){
			this->health = health;
			return *this;
		}
		Entity& setLevel(int level){
			this->level = level;
			return *this;
		}
		Entity& setType(const string& type){
			this->type = type;
			return *this;
		}


		string getName()  const{
			return this->name;
		}

		int getHealth() const{
			return this->health;
		}

		int getLevel()  const{
			return this->level;
		}

		string getType() const{
			return this->type;
		}

		void displayInfo() const{
			cout << "Name: " << this->name << endl;
			cout << "Health: " << this->health << endl;
			cout << "Level: " << this->level << endl;
			cout << "Type: " << this->type << endl;

			cout << endl << endl;
		}
};

		namespace Physics {
		  double clamp(double val, double min, double max){ // clamp a velocity

			  if (val < min) {
			  	  return min;
			  }
  			  else if (val > max) {
				  return max;
			   }
			  else {
			      return val;
			  }

		  }

		  double lerp(double a, double b, double t){  // linear interpolation for physics
            return (a + (b - a) * t);
		  }
		}

		namespace GameMath {
		  int clamp(int val, int min, int max){     // clamp an integer stat (health, level)

			  if (val < min) {
	        	  return min;
			  }
			  else if (val > max) {
			 	  return max;
			  }
			  else {
				  return val;
			  }

		  }

		  double lerp(double a, double b, double t){   // lerp for UI animations
			  return (a + (b - a) * t);
		  }
		}

		void populateCount(int& count1, int& count2, int& count3, int& count4, int& count5, int& arrval){

			if(arrval == 0)
				count1++;

			else if(arrval == 1)
				count2++;

			else if(arrval == 2)
				count3++;

			else if(arrval == 3)
				count4++;

			else
				count5++;
		}


		//Scope Resolution Bonus (Optional)
		int level = 1;

		namespace Engine{
		  namespace Audio{
		    void playSound(string name){
		    	cout << "Playing: " << name << endl;
		    }

		  }
		}



int main(){
	Entity player, enemy, item;
	player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
	enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
	item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

	player.displayInfo();
	enemy.displayInfo();
	item.displayInfo();

	//****** PART B ******

	cout << endl;
	cout << "Physics Clamp: ";
	cout << Physics::clamp(30, 50, 100);
	cout << endl;
	cout << "Physics Lerp: ";
	cout << Physics::lerp(3, 7, 64);
	cout << endl << endl;

	cout << "GameMath Clamp: ";
	cout << GameMath::clamp(2, 10, 100);
	cout << endl;
	cout << "GameMath Lerp: ";
	cout << GameMath::lerp(30, 70, 2);
	cout << endl;

	{
	  using namespace Physics;
	  cout << clamp(10,20,3000);
	}
	  cout << endl;
	{
	  using namespace Physics;
	  cout << clamp(8000,20,590);
	}
	cout << endl;

	//********** PART C **********
	int R = 3;
	int C = 4;

	//CReate 2D array in heap
	int** arr = new int*[R];

	//Create columns for each row
	for(int i = 0; i < R; i++){

		arr[i] = new int[C];

		for(int j = 0; j < C; j++){
		arr[i][j] = rand() % 5;
		}
	}


	cout <<"\n===== GAME MAP ("<< R <<" x "<< C << ") " << "=====" <<endl << endl;
	int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

	for(int i = 0; i < R; i++){
		for(int j = 0; j < C; j++){
		populateCount(count1, count2, count3, count4, count5, arr[i][j]);
		cout << arr[i][j] << " ";
		}
		cout << endl;
	}

	cout << endl;
	cout << "Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon" << endl << endl;;

	cout << "Tile Count:" << endl;
	cout << "  Grass    : " << count1 << endl;
	cout << "  Water    : " << count2 << endl;
	cout << "  Mountain : " << count3 << endl;
	cout << "  Forest   : " << count4 << endl;
	cout << "  Dungeon  : " << count5 << endl;


    //Scope Resolution Bonus (Optional)
      int level = 10;   //Player level
      cout << "\nDifficulty level: " <<::level << endl; //called global level
      cout << "Player level: " << level; //local level

      cout << endl;

      Engine::Audio::playSound("sword_clash"); //call using path


	return 0;
}


