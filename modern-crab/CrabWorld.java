// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 292, 292);
        Worm worm =  new  Worm();
        addObject(worm, 150, 108);
        Worm worm2 =  new  Worm();
        addObject(worm2, 326, 120);
        Worm worm3 =  new  Worm();
        addObject(worm3, 472, 222);
        Worm worm4 =  new  Worm();
        addObject(worm4, 383, 178);
        Worm worm5 =  new  Worm();
        addObject(worm5, 175, 164);
        Worm worm6 =  new  Worm();
        addObject(worm6, 230, 120);
        Worm worm7 =  new  Worm();
        addObject(worm7, 444, 379);
        Worm worm8 =  new  Worm();
        addObject(worm8, 265, 380);
        Worm worm9 =  new  Worm();
        addObject(worm9, 152, 251);
        Worm worm10 =  new  Worm();
        addObject(worm10, 103, 372);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 519, 13);
    }
}
