/*
 * Q2.cpp
 *
 *  Created on: 04-Sept-2026
 *      Author: Ritesh
 */

#include <iostream>
#include <memory>
using namespace std;

class Texture{
private:
	string name;
	int width;
	int height;

public:
	Texture(const string& name, int width, int height) : name(name), width(width), height(height){
		cout << "Texture Loaded" << endl;
	}

	~Texture(){
		cout << "[Texture Released]" << endl;
	}

	void display() const{
		cout << "Texture: " << name << endl;
		cout << "Dimensions: " << width << "x" << height << endl;
	}
};

class Shader{
private:
	string name;
	string type;

public:
	Shader(string name, string type): name(name), type(type){
		cout << "[Shader Compiled]" << endl;;
	}

	~Shader(){
		cout << "[Shader Destroyed]" << endl;;
	}

	int getReferenceCount(const shared_ptr<Shader>& shader)
	{
	   return shader.use_count();
	}
};

class AudioClip{

private:
	    string name;
	    double duration;

	public:
	    AudioClip(const string& name, double duration)
	        : name(name), duration(duration)
	    {
	        cout << "[AudioClip Loaded]" << endl;
	    }

	    ~AudioClip()
	    {
	        cout << "[AudioClip Unloaded]" << endl;
	    }

	    string getName() const
	        {
	            return name;
	        }

};

int main(){

// Required structure in main():
	auto tex1 = make_unique<Texture>("player_sprite", 512, 512);
	tex1->display();

//	 unique_ptr<Texture> tex2 = tex1;   // ← Comment this out, explain why it fails
//	Answer - It fails because unique_ptr cannot be copied.

	unique_ptr<Texture> tex2 = move(tex1);
	cout << "tex1 is null: " << (tex1 == nullptr ? "YES" : "NO") << endl;




// Required structure in main():
	auto shader = make_shared<Shader>("main_vert", "vertex");
	cout << "Ref count: " << shader.use_count() << endl;   // 1
	{

	auto rendererRef = shader;
	cout << "Ref count: " << shader.use_count() << endl;  // 2

	auto editorRef   = shader;
	cout << "Ref count: " << shader.use_count() << endl;  // 3
	}
	cout << "Ref count: " << shader.use_count() << endl;   // 1



	// Required structure in main():
	auto audio = make_shared<AudioClip>("explosion", 3.5);

	weak_ptr<AudioClip> observer = audio;

	if (auto clip = observer.lock())
	cout << "Clip alive: " << clip->getName() << endl;

	audio.reset();

	// unload
	if (observer.expired())
	cout << "Clip already unloaded." << endl;


	return 0;
}



