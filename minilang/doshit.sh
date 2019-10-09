unset CLASSPATH
CLASSPATH="deps/antlr-4.7.2-complete.jar"
alias antlr4='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.gui.TestRig'

mkdir -p ./build
antlr4 -visitor ./src/parser/grammar/Grammar.g4 -Xexact-output-dir -o ./src/parser/generated_code/
javac -cp "./build:$CLASSPATH" ./src/parser/generated_code/*.java -d ./build
javac -cp "./build:$CLASSPATH" ./src/parser/visitor/Visitor.java -d ./build
javac -Xlint:none -cp "./build:$CLASSPATH" ./src/compiler/Run.java -d ./build
