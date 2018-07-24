/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndljava.lucene;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

/**
 *
 * @author admin
 */
public class createIndex {

    public static void main(String[] args) {

        try {
            String paths = "g:/";

            File indexDir = new File(paths+"/lucc");
            File dataDir = new File(paths);

            Analyzer luceneAnalyzer = new StandardAnalyzer();

            Directory dic = FSDirectory.open(Paths.get(paths+"/lucc"));
            IndexWriterConfig iwc = new IndexWriterConfig(luceneAnalyzer);
            IndexWriter indexWriter = new IndexWriter(dic, iwc);

            File[] flist = dataDir.listFiles();
            for (File f : flist) {
//                if (f.getName().endsWith(".BIN")) {
//                    continue;
//                }
                if (f.isDirectory()) {
                    continue;
                }

                System.out.println("path:" + f.getCanonicalPath());

                Document doc = new Document();

                Field fileName = new TextField("fileName", f.getName(), Field.Store.YES);
                Field filePath = new TextField("filePath", f.getCanonicalPath(), Field.Store.YES);
                Field fileSize = new TextField("fileSize", f.getUsableSpace() + "", Field.Store.YES);
                
                FileReader fr=new FileReader(f);
                 
                Field fileContent = new TextField("fileContent", fr);

                doc.add(fileName);
                doc.add(filePath);
                doc.add(fileSize);
                doc.add(fileContent);
                
                indexWriter.addDocument(doc);
            }

            indexWriter.numDocs();
            
            indexWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(createIndex.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
