unset CLASSPATH
CLASSPATH="deps/antlr-4.7.2-complete.jar"
alias antlr4='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.gui.TestRig'

antlr4 ./src/parser/grammar/Calc.g4 -Xexact-output-dir -o ./src/parser/generated_code/
javac -cp "$CLASSPATH" ./src/compiler/Utils.java -d ./build
javac -cp "./build:$CLASSPATH" ./src/parser/generated_code/*.java -d ./build
javac -cp "./build:$CLASSPATH" ./src/compiler/MyCalcListener.java -d ./build
javac -Xlint:none -cp "./build:$CLASSPATH" ./src/compiler/Run.java -d ./build
