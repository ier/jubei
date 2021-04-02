# jubei

Clojure + GraalVM based console application.
It is a boilerplate for such type of solution and example of workflow.

## Your Clojure application

1. Create simple Clojure application using [lein](https://leiningen.org/):
```
lein new jubei
```
2. Update your ```project.clj``` file like [this](project.clj):

## Installation and build

1. Fetch archive with GraalVM v.21.0.0.2:
```
curl -L https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.0.0.2/graalvm-ce-java11-linux-amd64-21.0.0.2.tar.gz > graalvm-ce-java11-linux-amd64-21.0.0.2.tar.gz
```

2. Unpack the content:
```
tar zxf graalvm-ce-java11-linux-amd64-21.0.0.2.tar.gz
```

3. Move unpacked content to your local /opt directory:
```
sudo mv graalvm-ce-java11-21.0.0.2 /opt
```

4. Install native-image with the help of GraalVM Updater utility ```gu```:
```
/opt/graalvm-ce-java11-21.0.0.2/bin/gu install native-image
```

Check the result:
```
/opt/graalvm-ce-java11-21.0.0.2/bin/gu list
```

5. Change your location to your Clojure application:
```
cd ~/src/jubei
```

6. Build you CLojure project with lein:
```
lein native-image
```

## Usage

Run your application:
```
target/default/jubei
```

# Introduction to jubei

<table style="border: 0px solid #fff;">
    <tr>
        <td>
<pre>
Bandit Boss: [after Jubei defeats a trio of bandits]
             Then, it's true! They hired you for 
             only 20 pieces of gold, Jubei?
      Jubei: Yeah.
Bandit Boss: But the sword we stole was a precious 
             treasure given by the Shogun! 
             And they're paying you only 20 pieces
             of gold for getting it back for them?
             [laughs]
             You fool!
      Jubei: They're a poor, small clan. You can't 
             swindle 300 pieces of gold for a sword. 
             You're asking too much - you're the fool!
Bandit Boss: Shut up! Damn you!
      Jubei: [finishes his rice ball, notices the weather]
             Looks like a storm is brewing here.
             I better get movin'!
</pre>
        </td>
    <td>
    <img src="doc/jubei.jpg">
    </td>
</tr>
</table>