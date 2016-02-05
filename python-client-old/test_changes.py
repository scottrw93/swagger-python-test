import swagger_client.apis

apis = swagger_client.apis.SpecificalarmApi()

apis.upload_files('README.md', id='33')
apis.upload_files('README.md')
apis.upload_multiple_files(['README.md', 'setup.py'])
