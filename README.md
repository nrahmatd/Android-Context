# AndroidContext
Android context which is used to initialize context globally in an application.

# How to use
- Create a class and extend to AndroidContext like this :

```class GlobalApp : AndroidContext() {}```

- Append on AndroidManifest.xml 

```
<application
        android:name=".GlobalApp"
        android:allowBackup="true" />
```

# How to use in Gradle

- Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

-  Add the dependency in build.gradle(app)

```
dependencies {
	        implementation 'com.github.nrahmatd:AndroidContext:1.0.0'
	}
```


