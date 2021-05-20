-- Specifies which database to use for the remainder of statements in the script
USE `droneportation`;

-- Empties the table first so anything existing is cleared out before inserting new database
-- Only needed if the intent is to replace everything in the table
TRUNCATE `passgroup`;
-- Add new records to the table
INSERT INTO `passgroup` (GroupID, Nickname, `Description`, OwnerID, GroupTypeID) 
 VALUES (1,'Wong Family','Vacation',169,1),(2,'Wilkinson Family','Vacation',100,1),(3,'Whitaker Family','Vacation',195,1),(4,'Washington Family','Vacation',194,1),(5,'Warren Family','Vacation',183,1),(6,'Warner Family','Vacation',117,1),(7,'Warner Family','Vacation',214,1),(9,'Walker Family','Vacation',126,1),(10,'Wackwitz Family','Vacation',14,1),(11,'Velez Family','Vacation',180,1),(12,'Terrell Family','Vacation',122,1),(14,'Talley Family','Vacation',138,1),(15,'Sweeney Family','Vacation',115,1),(16,'Rosa Family','Vacation',102,1),(17,'Rosa Family','Vacation',295,1),(18,'Romero Family','Vacation',189,1),(19,'Riley Family','Vacation',174,1),(20,'Rice Family','Vacation',198,1),(21,'Reyes Family','Vacation',153,1),(22,'Reeves Family','Vacation',107,1),(23,'Porter Family','Vacation',116,1),(24,'Park Family','Vacation',125,1),(25,'Olsen Family','Vacation',121,1),(26,'Neal Family','Vacation',157,1),(27,'Moreno Family','Vacation',188,1),(28,'Montgomery Family','Vacation',135,1),(29,'Montgomery Family','Vacation',321,1),(30,'Medina Family','Vacation',170,1),(31,'Medina Family','Vacation',345,1),(32,'Mcgowan Family','Vacation',176,1),(33,'Lyons Family','Vacation',113,1),(34,'Lowenhagen Family','Vacation',11,1),(35,'Lowenhagen Family','Vacation',302,1),(37,'Logan Family','Vacation',106,1),(38,'Lindsey Family','Vacation',186,1),(39,'Kirkland Family','Vacation',133,1),(40,'Key Family','Vacation',120,1),(41,'Hess Family','Vacation',146,1),(42,'Hart Family','Vacation',111,1),(43,'Harding Family','Vacation',164,1),(44,'Hancock Family','Vacation',173,1),(46,'Griffin Family','Vacation',134,1),(47,'Glover Family','Vacation',109,1),(48,'Gay Family','Vacation',161,1),(49,'Galloway Family','Vacation',108,1),(50,'Francis Family','Vacation',114,1),(51,'Flowers Family','Vacation',144,1),(52,'Flowers Family','Vacation',219,1),(53,'Flowers Family','Vacation',285,1),(54,'Flowers Family','Vacation',367,1),(55,'Ferguson Family','Vacation',110,1),(56,'Emerson Family','Vacation',136,1),(57,'Emerson Family','Vacation',286,1),(58,'Edwards Family','Vacation',184,1),(59,'Dotson Family','Vacation',175,1),(60,'Decker Family','Vacation',182,1),(61,'Craig Family','Vacation',190,1),(62,'Cote Family','Vacation',137,1),(63,'Cooley Family','Vacation',12,1),(64,'Cooley Family','Vacation',340,1),(65,'Collier Family','Vacation',140,1),(66,'Carpenter Family','Vacation',162,1),(67,'Cain Family','Vacation',187,1),(68,'Bryan Family','Vacation',127,1),(69,'Branch Family','Vacation',128,1),(70,'Black Family','Vacation',118,1),(71,'Black Family','Vacation',200,1),(72,'Black Family','Vacation',271,1),(73,'Bennett Family','Vacation',101,1),(74,'Bender Family','Vacation',132,1),(75,'Barrett Family','Vacation',147,1),(76,'Barrera Family','Vacation',196,1),(77,'Barrera Family','Vacation',322,1),(78,'Atkins Family','Vacation',143,1),(79,'Ashley Family','Vacation',105,1),(80,'Alvarez Family','Vacation',192,1),(81,'Chester\'s Team','Remote Support Service Team',130,2),(82,'TaShya\'s Team','Sales Team',177,2),(83,'Rae\'s Team','Quality Assurance Team',238,2),(84,'Hall\'s Team','Executive Directors',320,2),(85,'Macaulay\'s Team','IT Managers',101,2),(86,'Uriah\'s Team','Quality Assurance Team',183,2),(87,'Gregory\'s Team','IT Managers',203,2),(88,'TaShya\'s Team','Remote Support Service Team',342,2),(89,'Bradley\'s Team','IT Managers',326,2),(90,'Karen\'s Team','IT Managers',244,2),(91,'Stephen\'s Team','Sales Team',175,2),(92,'Bradley\'s Team','Quality Assurance Team',129,2),(93,'Vernon\'s Team','Executive Directors',296,2),(94,'Avram\'s Team','Quality Assurance Team',105,2),(95,'Chester\'s Team','IT Managers',374,2);

TRUNCATE passgroupmember;
INSERT INTO `passgroupmember` (GroupID, PassID) 
 VALUES (1,169),(1,314),(2,100),(2,217),(2,261),(2,266),(3,195),(3,333),(3,372),(4,194),(4,289),(4,349),(5,183),(5,236),(6,117),(6,203),(7,214),(7,267),(7,273),(7,324),(9,126),(9,202),(9,262),(10,14),(10,224),(10,226),(10,304),(11,180),(11,317),(12,122),(12,209),(12,212),(12,269),(12,342),(14,138),(14,244),(14,370),(15,115),(15,235),(15,256),(15,294),(16,102),(16,208),(17,295),(17,334),(17,347),(18,189),(18,330),(19,174),(19,277),(20,198),(20,279),(21,153),(21,232),(21,239),(22,107),(22,263),(22,315),(22,339),(22,354),(22,359),(23,116),(23,210),(23,307),(23,344),(24,125),(24,318),(25,121),(25,227),(25,282),(26,157),(26,316),(27,188),(27,312),(28,135),(28,245),(29,321),(29,332),(30,170),(30,241),(30,250),(30,275),(30,297),(30,306),(31,345),(31,350),(31,368),(31,376),(32,176),(32,213),(32,238),(32,327),(33,113),(33,247),(33,274),(33,276),(33,305),(33,320),(34,11),(34,225),(34,242),(34,258),(34,260),(34,288),(35,302),(35,310),(35,325),(37,106),(37,179),(37,272),(37,346),(37,358),(38,186),(38,280),(39,133),(39,229),(39,313),(39,365),(40,120),(40,292),(41,146),(41,284),(42,111),(42,222),(42,308),(42,337),(42,373),(43,164),(43,255),(44,173),(44,343),(46,134),(46,223),(46,259),(47,109),(47,254),(47,268),(48,161),(48,240),(49,108),(49,230),(50,114),(50,150),(51,144),(51,152),(51,177),(51,204),(51,205),(51,215),(52,219),(52,248),(52,265),(52,278),(53,285),(53,296),(53,298),(53,299),(53,366),(54,367),(54,371),(55,110),(55,290),(55,362),(56,136),(56,207),(56,211),(56,251),(56,264),(57,286),(57,300),(57,309),(57,331),(57,335),(57,364),(58,184),(58,233),(58,311),(59,175),(59,270),(60,182),(60,319),(61,190),(61,369),(62,137),(62,341),(63,12),(63,13),(63,218),(63,221),(63,323),(63,336),(64,340),(64,356),(65,140),(65,243),(65,291),(66,162),(66,231),(66,237),(66,257),(66,293),(67,187),(67,352),(67,353),(67,355),(68,127),(68,283),(69,128),(69,338),(70,118),(70,129),(71,200),(71,252),(72,271),(72,281),(72,301),(72,357),(72,361),(73,101),(73,249),(73,253),(74,132),(74,220),(75,147),(75,360),(76,196),(76,201),(76,228),(76,234),(76,287),(76,303),(77,322),(77,328),(78,143),(78,206),(78,216),(79,105),(79,351),(80,192),(80,246),(80,326),(80,375),(81,130),(81,206),(81,237),(81,293),(82,106),(82,143),(82,154),(82,177),(82,286),(83,153),(83,186),(83,230),(83,238),(83,349),(84,113),(84,142),(84,191),(84,291),(84,320),(84,345),(85,101),(85,174),(85,205),(85,273),(85,279),(86,120),(86,183),(86,185),(86,305),(86,306),(87,203),(87,232),(87,239),(87,315),(88,242),(88,342),(88,357),(89,147),(89,300),(89,322),(89,326),(89,363),(90,148),(90,244),(91,175),(91,220),(91,281),(91,294),(91,316),(92,129),(92,285),(93,265),(93,296),(94,105),(94,109),(94,307),(95,124),(95,150),(95,271),(95,374);