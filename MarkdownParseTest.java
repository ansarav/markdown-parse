

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;1) testSnippet1(MarkdownParseTest)
java.lang.AssertionError: expected:<[`google.com, google.com, ucsd.edu]> but was:<[url.com, `google.com, google.com]>

    @Test
    public void testImageDistinction() throws IOException {
        ArrayList<String> Image = new ArrayList<>();
        Image.add("a-link.html");
        String ImageTest = MarkdownParse.converter("image-distinction.md");
        assertEquals(Image, MarkdownParse.getLinks(ImageTest));
    }

    @Test
    public void testSnippet1() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("`google.com");
        SnippetExpected.add("google.com");
        SnippetExpected.add("ucsd.edu");
        String SnippetActual = MarkdownParse.converter("Snippet1.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }

    @Test
    public void testSnippet2() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("b.com");
        SnippetExpected.add("a.com(())");
        SnippetExpected.add("example.com");
        String SnippetActual = MarkdownParse.converter("Snippet2.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }

    @Test
    public void testSnippet3() throws IOException {
        ArrayList<String> SnippetExpected = new ArrayList<>();
        SnippetExpected.add("https://ucsd-cse15l-w22.github.io/");
        String SnippetActual = MarkdownParse.converter("Snippet3.md");
        assertEquals(SnippetExpected, MarkdownParse.getLinks(SnippetActual));
    }
    }
