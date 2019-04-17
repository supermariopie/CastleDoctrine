Game: CS Club Castle Doctrine -- 
Build defenses to a house, and then invade it!

Time is turn based in this game -- one movement of the player (one tile move) is one time unit.


built by Jacob, Adison, Andrew and Dan of the Oak Ridge CS Club starting 4/10/19

Tasks:
• Image Creation -- Adison
• Save file mechanism -- Andrew
• General Class structure
• Key and Mouse Listeners -- Dan
• Load image files into image grid
• Take back Jerusalem with good crusades




Save files
____________
--Andrew

This is the format for a save file:

FileName RoomName Room Height Room Width (Number of pieces of extra info)
extra info 1
extra info 2
etc.
Tile info [0,0] Tile info [0,1] ...
Tile info [1,0] Tile Info [1,1] ...

//Each line will have a single number, the type of the tile
//this string will correspond via a HashMap to an object which holds the appropriate action for the item

Tile IDs:
0 - Empty Tile
1 - Goal Tile
2 - Wall TileGame: CS Club Castle Doctrine -- 
Build defenses to a house, and then invade it!

Time is turn based in this game -- one movement of the player (one tile move) is one time unit.