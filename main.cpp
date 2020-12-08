#include <iostream>
#include "antlr4-runtime.h"
#include "mathLexer.h"
#include "mathParser.h"

using namespace std;
using namespace antlr4;

int main(int argc, const char* argv[]) {
    std::ifstream stream;
    stream.open("input.math"); //TODO: update input file path

    ANTLRInputStream input(stream);
    mathLexer lexer(&input);
    CommonTokenStream tokens(&lexer);
    mathParser parser(&tokens);
}