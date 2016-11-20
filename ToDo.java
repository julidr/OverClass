/**
 * 
 */
package co.edu.usa.adf.vaadin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Danilo
 *
 */
public class ToDo implements Serializable
{
   private static final long serialVersionUID = 104209167841304193L;
   private int id;
   private String message;
   private Date deadline;
   private int priority;
   private int progress;
   private boolean finished;
   private boolean isPersisted;
   
   public ToDo()
   {
      isPersisted = false;
   }
   
   public ToDo( int id, String message, Date deadline, int priority )
   {
      super();
      this.id = id;
      this.message = message;
      this.deadline = deadline;
      this.priority = priority;
      this.isPersisted = true;
   }

   public String getMessage()
   {
      return message;
   }
   
   public void setMessage( String message )
   {
      this.message = message;
   }
   
   public Date getDeadline()
   {
      return deadline;
   }
   
   public void setDeadline( Date deadline )
   {
      this.deadline = deadline;
   }
   
   public int getPriority()
   {
      return priority;
   }
   
   public void setPriority( int priority )
   {
      this.priority = priority;
   }
   
   public int getProgress()
   {
      return progress;
   }
   
   public void setProgress( int progress )
   {
      this.progress = progress;
   }
   
   public boolean isFinished()
   {
      return finished;
   }
   
   public void setFinished( boolean finished )
   {
      this.finished = finished;
   }

   public int getId()
   {
      return id;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public boolean isPersisted()
   {
      return isPersisted;
   }

   public void setPersisted( boolean isPersisted )
   {
      this.isPersisted = isPersisted;
   }
   
   
}
