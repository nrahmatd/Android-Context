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

