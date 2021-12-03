var ImagePicker = {

   imageAside: document.querySelector('.picText'),
   imagePic: document.querySelector('#pic'),
   oldImagePicId: 0,
   newImagePicId: 0,

   init: function() {
    
    let imageTabsDiv = document.querySelector('#imageTabs');
    var imageTabsList = imageTabsDiv.querySelectorAll('img');

    for (let i = 0; i < imageTabsList.length; i++){
      
      imageTabsList[i].onclick = ImagePicker.imageTabClick;
      
    }

    var randomIndex = ImagePicker.randRange(0, imageTabsList.length);
    
    ImagePicker.imagePic.src = imageTabsList[randomIndex].getAttribute('longdesc');
    ImagePicker.newImagePicId = randomIndex;


   ImagePicker.imagePic.addEventListener('mouseenter', this.showImageDescription);

   ImagePicker.imagePic.addEventListener('mouseleave', this.hideImageDescription);
  
  },

  imageTabClick() {
    
    ImagePicker.oldImagePicId = ImagePicker.newImagePicId;
    ImagePicker.newImagePicId = this.id;
    document.querySelector('aside.picText > #p' + ImagePicker.oldImagePicId).setAttribute("display", "none");

    let imgPath = this.getAttribute('longdesc');
    console.log(imgPath);
    ImagePicker.imagePic.src = imgPath;
  },

  showImageDescription(){
    ImagePicker.imageAside.style.opacity = "1.0";
    ImagePicker.imageAside.querySelector('#p' + ImagePicker.newImagePicId).style.display = 'block'; 
    console.log(ImagePicker.newImagePicId);
  },

  hideImageDescription() {
    ImagePicker.imageAside.style.opacity = "0.0";
  },

  randRange(min, max){
    return Math.floor(Math.random() * (max - min) + min);
  }
};