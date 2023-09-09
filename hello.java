// install homebrew
// brew install java
// add openjdk to path in .zshrc
//  $ export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
// add symlink to java wrappers
/*
    $ sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk \
     /Library/Java/JavaVirtualMachines/openjdk.jdk
*/ 


public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("It's nice to meet you~");
    }
}

// javac hello.java     :compile
// java hello           :run java program