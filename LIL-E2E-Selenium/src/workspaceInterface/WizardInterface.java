package workspaceInterface;

import java.io.IOException;

public interface WizardInterface {
      
	 public void listOfWizard();
	 public void clickUponWizard(String xpath);
     public void title();
     public void description();
     public void audienceTargetFrom();
     public void duration();
     public void audienceTargetTo();
     public void googleSearch();
     public void bannerImage() throws IOException, InterruptedException;
     public void baseImage() throws IOException, InterruptedException;
    
    
}
