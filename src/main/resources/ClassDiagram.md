User
- ID
- Name
- List<Game> games;

Position
- X
- Y

Piece
- ID
- Color (Enum)
- Status (Enum)
- Position

State
- Map<Color, Map<Status, List<Piece>>> board
- Map<ID, Position>> pieces;

Game
- User Player1
- User Player2
- boolean turnWhite;
- Status (RUNNING, START, DRAW, TERMINATED, RESULT)
- Stack<State> moves;

Engine
- Game
- Status
- start(userId1, userId2)
- resume(gameId)
- save()
- move(start, end)
- resign()
- draw()
- undo()

Action
- void move(State state, Position startPosition, Position endPosition)
- private boolean validateMove(state, currentPosition, finalPosition) throws invalidMove;
- check piece is present
- check move validity MovePiece.move()

MovePiece
- boolean move(Piece piece, Position startPosition, Position endPosition)

    
  
    
