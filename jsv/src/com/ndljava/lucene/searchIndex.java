/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndljava.lucene;

import com.sun.javafx.scene.text.HitInfo;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

/**
 *
 * @author admin
 */
public class searchIndex {
    
    
    public static void main(String[] args) {
        
        try {
            String searchField="fileContent";
            String searchWords="教";
            
            Directory dir=FSDirectory.open(Paths.get("g:/lucc"));
            IndexReader ir=DirectoryReader.open(dir);
            IndexSearcher search=new IndexSearcher(ir);
            
            TermQuery tq=new TermQuery(new Term(searchField, searchWords));
            TopDocs td=search.search(tq,100);
            System.out.println("hit:"+td.totalHits);
            
            for(ScoreDoc sd:td.scoreDocs){
                Document doc=search.doc(sd.doc);
                System.out.println(doc.get("fileName"));
                System.out.println(doc.get("filePath"));
                 
                System.out.println(doc.get("fileSize"));
            }
            
            
            ir.close();
            
        } catch (IOException ex) {
            Logger.getLogger(searchIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
