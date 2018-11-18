package model;

import Tool.FileTool;

import java.io.IOException;
import java.util.ArrayList;

public class CreatePPT {
    ArrayList<String> input;
    ArrayList<String> nonterminalList;
    ArrayList<String> terminalList;

    public CreatePPT(ArrayList<String> input, ArrayList<String> nonterminalList, ArrayList<String> terminalList) {
        this.input = input;
        this.nonterminalList = nonterminalList;
        this.terminalList = terminalList;
    }

    public CreatePPT(String path) throws IOException {
        this.input = new ArrayList<String>();
        this.nonterminalList = new ArrayList<String>();
        this.terminalList = FileTool.read(path);
    }

    public PPT create() {
        PPT ppt = new PPT();
        for(String str: input) {

        }
        return ppt;
    }

    public PPT start(String path) throws IOException {
        CreatePPT constuct = new CreatePPT(path);
        constuct.create();
        return constuct.create();
    }
}
