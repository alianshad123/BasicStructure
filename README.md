# BasicStructure
Basic mvvm stucture for all apps

### Setting up Dev

Here's a brief intro about what a developer must do in order to start developing
the project further:


Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```shell
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```
  
Step 2. Add the dependency
```shell
dependencies {
	        implementation 'com.github.alianshad123:BasicStructure:1.0.0'
	}
  
```
