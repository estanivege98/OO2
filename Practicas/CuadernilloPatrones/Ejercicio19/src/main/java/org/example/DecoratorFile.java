package org.example;

public abstract class DecoratorFile implements IFile{
    private IFile component;
    public DecoratorFile(IFile component){
        this.component = component;
    }

    public IFile getComponent(){
        return this.component;
    }

    public FileOO2 getFile(){
        return this.component.getFile();
    }

    public abstract String prettyPrint();
}
