# OrtrOPythonTranslator

Project Structure: 

   - antlr is the package and contains:
        - g4 modified files (lexer parser)
        - java files (pythonVersion, baseListener and baseParser are added manually; the others are generated by antlr4 from g4 files)
        - tokens and interp files generated by antlr4 from g4 files
        - class files generated by compiling java files (need to add the line "package antlr;" on every java files before compiling)
        - in case of others folder, they're trivial supplements
        
   - IO is the input/output folder
    
   - grun test folder is like the antlr package above but without manually implementation on java files
    
   - MainListener is the main file
    
