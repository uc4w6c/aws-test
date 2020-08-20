参考
https://www.it-swarm.dev/ja/spring/curlルートを介してamazon-s3にアップロードする/833521622/

GET

dateValue=`date -R`
stringToSign="GET\n\n\n${dateValue}\n${resource}"
signature=`echo -en ${stringToSign} | openssl sha1 -hmac ${s3Secret} -binary | base64`
curl -v \
  -H "Host: ${bucket}.s3.amazonaws.com" \
  -H "Date: ${dateValue}" \
  -H "Authorization: AWS ${s3Key}: ${signature}" \
  https://${bucket}.s3.amazonaws.com/${file}


