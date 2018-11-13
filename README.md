# UI-dialog-component
ui-dialog-component  is one of the component for enjoy android project.it has three kind of dialog(hold,prompt,ask).


# Usage

## common operation
```
ITalker.about(); //title for dialog
ITalker.off();//close dialog
ITalker.on();//open dialog
```
## hold dialog
```
 HoldTalker holdTalker = new HoldTalker(activity);
        holdTalker.about("title");//set title
        holdTalker.detail("message");//set message
        holdTalker.on();//open 
```        
## ask dialog
  ```
  AskTalker askTalker = new AskTalker(activity);
        askTalker.about("Title");
        askTalker.noText("cancel Button Text");
        askTalker.yesText("yes Button text");
        askTalker.yes(new Reactor() { //set callback for positive action
            @Override
            public void react(View v) {
                
            }
        });
        askTalker.no(new Reactor() { //set callback for nagetive action
            @Override
            public void react(View v) {
                
            }
        });
        askTalker.on();
   ```   
## prompt dialog
```
 PromptTalker promptTalker = new PromptTalker(activity);
        promptTalker.about("title");
        promptTalker.detail("detail message");
        promptTalker.reactText("prompt button text");
        promptTalker.reactor(new Reactor() { //set prompt callback for action
            @Override
            public void react(View v) {

            }
        });     
     promptTalker.off();      

```


        
